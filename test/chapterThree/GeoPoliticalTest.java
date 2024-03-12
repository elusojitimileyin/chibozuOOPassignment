package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalTest {
    @Test
    public void GeoPoliticalZoneTest(){
        GeoPolitical  myGeoPolitical = new GeoPolitical();
        assertEquals(GeoPolitical.GeoPoliticalZone.SOUTHWEST, GeoPolitical.resolveGeoZone("lagos"));
    }
    @Test
    public void GeoPoliticalZoneTes(){
        GeoPolitical  myGeoPolitical = new GeoPolitical();
        assertEquals(GeoPolitical.GeoPoliticalZone.SOUTHSOUTH, GeoPolitical.resolveGeoZone("edo"));
    }

}