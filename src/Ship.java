import java.io.*;
import java.util.*;
import javax.swing.*;

class Ship
{
    private String name;      // Ship name
    private String nation;    // Nation of registry
    private int year;    // 4 digit year built
    private int length;       // Length of ship at mean draft
    private int draft;        // average depth below sea level
    private int beam;         // side to side width at mean draft

    public Ship(String nam,  String nat,  int yer, int len, int dra, int bem)
    {
        name = nam;
        year = yer;
        nation = nat;
        length = len;
        draft = dra;
        beam = bem;
    }

    public int calculateDisplacement()
    {
        return length*beam*draft;
    }

    public void setName(String nem)
    {
        name = nem;
    }

    public void setNation(String nati)
    {
        nation = nati;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public String getNation()
    {
        return nation;
    }

    public String toString()
    {
        return name + ", " +
                year + ", " +
                nation + ", " +
                "Size: "+length +" by " +beam+" by " +draft;
    }

    public int getLength() {
        return length;
    }

    public int getDraft() {
        return draft;
    }

    public int getBeam() {
        return beam;
    }
}
