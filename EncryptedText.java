package com.string.bll;

public class EncryptedText {
	private int key;
	private String encryptedText="";

	public EncryptedText(String text) {
		this.encryptedText=text;
	}

		public EncryptedText(int key,String encryptedText) {
		this.key = key;
		this.setEncryptedText(encryptedText);
	}

	
	public boolean verifyKey(int key) {
		return this.key== key;
	}

	
	public boolean modifyKey(int previousKey,int newKey) {
		if(previousKey==this.key) {
			char[] eText = getDecryptedText(previousKey).toCharArray();
			this.key = newKey;
			encryptedText="";
			for(char c:eText)
				encryptedText+=Character.toString(c+=newKey);
			return true;
		}
		else
			return false;
	}
	public String getEncryptedText() {
		return encryptedText;
	}

	public String getDecryptedText(int key) {
		
				if(key==this.key ) {
			String decryptedText="";
			char[] eText = encryptedText.toCharArray();
			for(char c:eText) 
				decryptedText +=Character.toString(c-=key); 	
			return decryptedText;
		}
		else
			return "Incorrect key! please enter correct key";	
	}
	
	public void setEncryptedText(String encryptedText) {
				char[] eText = encryptedText.toCharArray();
		for(char c:eText) {
			
	 this.encryptedText+=Character.toString(c+=key); 	
		}
	}
		
	}


