class Base {
static {
System.out.print("STATIC:");
}
{
System.out.print("INIT:");
}
}
class MyClass extends Base {
static {
System.out.print("static-der:");
}
{
System.out.print("init-der:");
}
public static void main(String args[]) {
new MyClass();
}
}
