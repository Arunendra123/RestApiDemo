package com.learning.RestApiDemo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tables {
	 List<String> l;
	 public Tables() {
		 
	 }
	 public String getTable(int number){
		 String table="";
		 for(int i=1;i<=10;i++) {
			 table=table+i*number+",";
		 }
		 return table;
	 } 
	 
	 public String getTableTill(int number){
		 String table="";
		 for(int j=1;j<=number;j++) {
			 for(int i=1;i<=10;i++) {
				 table=table+i*j+",";
			 }
			 table=table+"\n";
		 }
		 return table;
	 } 
	 @Produces(MediaType.APPLICATION_ATOM_XML)
	 public List<String> getTableList(int number){
		 l=new ArrayList<String>();
		 for(int j=1;j<=number;j++) {
			 String table="";
			 for(int i=1;i<=10;i++) {
				 table=table+i*j+",";
			 }
			 l.add(table);
		 }
		 return l;
	 } 
}
