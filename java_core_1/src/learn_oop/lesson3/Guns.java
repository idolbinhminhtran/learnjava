package learn_oop.lesson3;

import java.util.Random;
import java.sql.SQLOutput;

public class Guns
{
    String weaponName;
    int ammoNumber;

    public void Load(int x)
    {
        this.ammoNumber += x;
    }

    public void Shoot(int x)
    {
        if (this.ammoNumber - x >= 0)
        {
            this.ammoNumber -= x;
        }




    }

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public Guns(int ammoNumber)
    {
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}


class RunerMain
{

    public static void main(String[] args)
    {

        Guns DiepBeDe = new Guns(100);
        Guns DoanXinhGai = new Guns(100);

        System.out.println(DiepBeDe.ammoNumber + " " +  DoanXinhGai.ammoNumber);


        while (true)
        {
            Random randomGenerator = new Random();
            int x1 = randomGenerator.nextInt(10);
            int x2 = randomGenerator.nextInt(10);
            DiepBeDe.Shoot(x1);
            DoanXinhGai.Shoot(x2);

            System.out.println("DiepBeDe ammo left: " + DiepBeDe.getAmmoNumber());
            System.out.println("DoanXinhGai ammo left: " + DoanXinhGai.getAmmoNumber());
            if (DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0)
            {
                System.out.println("Draw");
                break;
            }
            if (DiepBeDe.getAmmoNumber() == 0)
            {
                System.out.println("DiepBeDe is out of Ammo");
                System.out.println("DoanXinhGai is the winner");
                break;

            }
            else if (DoanXinhGai.getAmmoNumber() == 0)
            {
                System.out.println("DoanXinhGai is out of Ammo");
                System.out.println("DiepBeDe is the winner");
                break;
            }
            else
            {
                int x3 = randomGenerator.nextInt(10);
                int x4 = randomGenerator.nextInt(10 );
                DiepBeDe.Load(x3);
                DoanXinhGai.Load(x4);
            }




        }


    }
}






