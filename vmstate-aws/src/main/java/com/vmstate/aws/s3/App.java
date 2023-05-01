package com.vmstate.aws.s3;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		FileStoreImpl fileStore = new FileStoreImpl("aws-bucket-name", "AWSAccessKey","AWSSecretAccessKey");
		fileStore.upoadtoS3("20230430/100/114.txt", "Test File Content");
		
		File fileObj = new File("C:\\Users\\vmstate\\Downloads\\20230425-s3-test-01.txt");
		fileStore.upoadtoS3("20230430/200/214.txt", fileObj);

	}

}
