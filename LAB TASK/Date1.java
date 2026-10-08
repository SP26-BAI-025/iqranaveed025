public class Date1{
int d;
int m;
int y;
Date1(int date , int month , int year )
{
this.d=date;
this.m=month;
this.y=year;
}
public String toString()
{
return String.format("%d-%d-%d ",d,m,y);
}

}