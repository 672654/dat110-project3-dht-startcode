package no.hvl.dat110.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash { 
	
	
	public static BigInteger hashOf(String entity) {	
		
		BigInteger hashint = null;
		
		// Task: Hash a given string using MD5 and return the result as a BigInteger.
    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update(entity.getBytes());
      byte[] digest = md.digest();
      String hex = toHex(digest);
      hashint = new BigInteger(hex,16);
      
    } catch (NoSuchAlgorithmException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
		
		// we use MD5 with 128 bits digest
		
		// compute the hash of the input 'entity'
		
		// convert the hash into hex format
		
		// convert the hex into BigInteger
		
		// return the BigInteger
		
		return hashint;
	}
	
	public static BigInteger addressSize() {
		
    BigInteger adressSize;
		// Task: compute the address size of MD5
		
		// compute the number of bits = bitSize()
		int numberOfBits = bitSize();

		// compute the address size = 2 ^ number of bits
    adressSize = BigInteger.valueOf(2).pow(numberOfBits);

		
		// return the address size
		
		return adressSize;
	}
	
	public static int bitSize() {
		
		int digestlen = 128;
		
		// find the digest length
		
		return digestlen;
	}
	
	public static String toHex(byte[] digest) {
		StringBuilder strbuilder = new StringBuilder();
		for(byte b : digest) {
			strbuilder.append(String.format("%02x", b&0xff));
		}
		return strbuilder.toString();
	}

}
