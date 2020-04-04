package Serial;
import java.io.*;

public class Employee implements Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    int ID;

    public Employee()
    {
    }

    public Employee(String n, String a, int s, int i)
    {
        name=n;
        address=a;
        SSN=s;
        ID=i;
    }

    public void Print()
    {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Address: %s\n", address);
        System.out.printf("SSN: %s\n", SSN);
        System.out.printf("ID: %s\n", ID);
    }

    public void Store(String filename)
    {
        FileOutputStream outfile=null;
        try
        {
            outfile=new FileOutputStream(filename);
            ObjectOutputStream outobject=new ObjectOutputStream(outfile);
            outobject.writeObject(this);
            outobject.close();
            outfile.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Employee Restore(String filename)
    {
        Employee e=new Employee();
        FileInputStream infile=null;
        try
        {
            infile=new FileInputStream("employees.ser");
            ObjectInputStream inobject=new ObjectInputStream(infile);
            e=(Employee )inobject.readObject();
            inobject.close();
            infile.close();
        }
        catch (IOException i)
        {
            i.printStackTrace();
            System.exit(0);
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            System.exit(0);
        }
        return e;
    }

    public static void main(String []args)
    {
        Employee e=new Employee("James Wise", "1303 Midland Avenue", 123456789, 1);
        e.Print();
        e.Store("employees.ser");
        Employee f=Restore("employees.ser");
        f.Print();
    }
}
