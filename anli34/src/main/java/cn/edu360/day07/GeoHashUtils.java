package cn.edu360.day07;

import ch.hsr.geohash.GeoHash;

public class GeoHashUtils {
	
	public static String getGeoHash(Double latitude,Double longitude){
		String base32 = GeoHash.withCharacterPrecision(latitude, longitude, 8).toBase32();
		return base32;
	}
}
