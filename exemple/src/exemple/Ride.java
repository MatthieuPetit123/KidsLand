/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

/**
 *
 * @author Matthieu Petit
 */
public class Ride {
    public String name;
    public int avail;
    public int popularity;
    public double price;
    public String features;
   
    public void setName(String n)
    {
        name = n;
    }
    public void setAvail(int d)
    {
        avail = d;
    }
    public void setPopularity(int pop)
    {
        popularity = pop;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public void setFeatures(String f)
    {
        features = f;
    }
   
    public String getName()
    {
        return name;
    }
    public int getAvail()
    {
        return avail;
    }
    public int getPopularity()
    {
        return popularity;
    }
    public double getPrice()
    {
        return price;
    }
    public String getFeatures()
    {
        return features;
    }
   
    public void display()
    {
        System.out.print( name+" - " +avail+ " - "+popularity+ " - "+price+ " - "+features  );
    }
}
