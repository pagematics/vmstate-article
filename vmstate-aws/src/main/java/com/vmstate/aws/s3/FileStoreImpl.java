package com.vmstate.aws.s3;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.Permission;
import java.io.File;

public class FileStoreImpl {

	private AmazonS3 s3Client;
	private String bucketName;

	public FileStoreImpl(String bucketName, String accessKey, String secretAccesskey) {
		try {
			Regions clientRegion = Regions.US_EAST_1;
			this.bucketName = bucketName;
			this.s3Client = AmazonS3ClientBuilder.standard()
					.withCredentials(new AWSStaticCredentialsProvider(
							(AWSCredentials) new BasicAWSCredentials(accessKey, secretAccesskey)))
					.withRegion(clientRegion).build();
		} catch (AmazonServiceException e) {
			e.printStackTrace();
		} catch (SdkClientException e) {
			e.printStackTrace();
		}
	}

	public void upoadtoS3(String filePath, String fileContent) {
		try {
			// Grant public the read permission on the file
			s3Client.putObject(bucketName, filePath, fileContent);

			// Grant public the read permission on the file
			 AccessControlList acl = s3Client.getObjectAcl(bucketName, filePath);
			 Permission permission = Permission.Read; Grantee grantee =
			 GroupGrantee.AllUsers; acl.grantPermission(grantee, permission);
			 s3Client.setObjectAcl(bucketName, filePath, acl);


		} catch (AmazonServiceException e) {
			e.printStackTrace();
		} catch (SdkClientException e) {
			e.printStackTrace();
		}
	}
	
	public void upoadtoS3(String filePath, File file) {

		try {
			s3Client.putObject(bucketName, filePath, file);

			// Grant public the read permission on the file
			 AccessControlList acl = s3Client.getObjectAcl(bucketName, filePath);
			 Permission permission = Permission.Read; Grantee grantee =
			 GroupGrantee.AllUsers; acl.grantPermission(grantee, permission);
			 s3Client.setObjectAcl(bucketName, filePath, acl);

		} catch (AmazonServiceException e) {
			e.printStackTrace();
		} catch (SdkClientException e) {
			e.printStackTrace();
		}
	}
}


