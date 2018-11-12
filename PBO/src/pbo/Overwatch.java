/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author VX5-591G-76KH
 */
class Heroes {        
    private String name;
    private int age;
    private String occupation;
    private String BoO;
    private String affiliation;
    private String motto;
        
    public Heroes(String nama,int usia,String okupasi, String basisOperasi, String afiliasi, String moto) {
        this.name=nama;        
        this.age=usia;        
        this.occupation=okupasi;
        this.BoO=basisOperasi;
        this.affiliation=afiliasi;
        this.motto=moto;
    }
   
    public void tampilData() { 
        System.out.println("==============================BIOGRAPHY================================");   
        System.out.println("Real Name               : "+ this.name);   
        System.out.println("Age                     : "+ this.age);
        System.out.println("Occupation              : "+this.occupation);  
        System.out.println("Base of Operations      : "+this.BoO); 
        System.out.println("Affliation              : "+this.affiliation); 
        System.out.println("");  
        System.out.println(this.motto);  
        System.out.println("=======================================================================");
        System.out.println("");
    } 
}
 
 public class Overwatch{                 
     public static void main(String[] args){   
         Heroes   heroes1=new Heroes("Genji Shimada" ,35 ,"Adventurer" ,"Shambali Monastery, Nepal", "Shimada Clan (formerly), Overwatch (formerly)", "'EVEN IF I SACRIFICE MY BODY, I WILL NEVER SACRIFICE MY HONOR.'");    
         heroes1.tampilData();   
         Heroes   heroes2=new Heroes("Winston" ,29 ,"Scientist, Adventurer" ,"Horizon Lunar Colony (formerly)", "Overwatch (formerly))", "'IMAGINATION IS THE ESSENCE OF DISCOVERY.'");    
         heroes2.tampilData();
    } 
 }
