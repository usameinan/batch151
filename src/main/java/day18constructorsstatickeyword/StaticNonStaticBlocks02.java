package day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){
        System.out.println("Constructor1");
    }

    public StaticNonStaticBlocks02(int price){
        System.out.println("Constructor2");
    }

    public StaticNonStaticBlocks02(String name){
        System.out.println("Constructor3");
    }

    public StaticNonStaticBlocks02(boolean isOld){
        System.out.println("Constructor4");
    }
    //non-static block constructorlarda calistirilmasi gereken ortak kodlari icerir
    //Non-Static block icine yazilan kodlar her constructor icin calistirilir
    //birden fazla non-static block varsa ustteki once calistirilir
    {
        System.out.println("I am constructor-ilk");
    }
    {
        System.out.println("I am constructor-ikinci");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);
    }


}//class
