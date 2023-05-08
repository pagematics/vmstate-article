package com.vmstate.list.linkedlist;

import java.util.LinkedList;

public class BrowerHistory 
{
	private LinkedList<String> history;
    private int maxSize;

    public BrowerHistory(int maxSize) 
    {
        this.history = new LinkedList<String>();
        this.maxSize = maxSize;
    }

    public void addPage(String url) 
    {
        history.addFirst(url); 
        if (history.size() > maxSize) 
        {
            history.removeLast(); 
        }
    }

    public void printHistory() 
    {
        System.out.println("Browser history");
        for (String url : history) 
        {
            System.out.println(url);
        }
    }
    
    public static void main(String[] args) 
    {
    	BrowerHistory browserHistory = new BrowerHistory(2);
        browserHistory.addPage("https://www.smartwcm.com");
        browserHistory.addPage("https://www.pagematics.com");
        browserHistory.addPage("https://www.sitepm.com");
        browserHistory.printHistory();
    }
}
