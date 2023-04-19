package day26abstraction;

    /*
        1) Bazen parent classtaki methodun bodysi hicbir child
           tarafindan kullanilmaz.
           Bu durumda parenttaki methoda body yazmak hic kullanilmadigi
           icin mantikli degildir
           Biz de o methoda body yazmayiz
        2) Bodysi yazilmayan methoda abstract method denir.
           Abstract ingilizce de vucutsuz veya soyut anlamindadir.
        3) Methodun bodysini yazmayinca java hata verir. biz de abstract
           keywordunu kullanarak javaya bu methodun bodysi olmayacak deriz.
        4) Abstract keywordunu kullaninca elde ettigimiz abstract method
           normal classlara konulamaz. o yuzden classi da abstract yapariz.
        5) Parenttaki method abstract ise butun child classlar o methodu
           override etmek zorundadir.
           bu yuzden tum childler icin mecburi olmasini istedigimiz fonksiyonlari
           abstract yapmak mantikli bir secimdir.
        6) Bodysi olan methodlar(concrete) abstract classlarin icine yazilabilir.
           abstract methodlar concrete classlarin icine yazilamazlar.
        7) Abstract keyword ile method body bir methodda ayni anda kullanilamaz.
        8) Abstract classlarin icinde abstract methodlar olur. abstract methodlar bodysi olmadigindan
           eksik methodlar gibi dusunulebilir.
           yani abstract class icinde eksik bir yapi barindirir. siz abstract classtan object uretirseniz
           abstract class icindeki eksiklik objecte yansir ve obje eksigi olan bir object olmus olur.
           java bunu istemez. cunku eksik object eksik is yapar. bu da aplicationun yanlıs
           calismasina sebep olur.
           java applicationu korumak icin abstract classlardan object uretilmesini engellemistir.
        9) Abstract classlarin constructoru vardir ama object olusturamazlar.
        10) final methodlar abstract olamazlar.
        11) private methodlar abstract olamazlar.
     */
    /*
        "final" keywordu aciklar misiniz?
        "final" keyword i) variablelarda ii) methodlarda iii) classlarda kullanilabilir.

        i) variablelarda kullanildiginda a) o variablea kesinlikle deger atamasi yapilmalidir.
                                         b) ilk atanan deger degistirilemez.

        ii) methodlarda kullanildiginde a) o methodun bodysi degistirilemez.
                                        b) o method override edilemez.

        iii) classlarda kullanildiginda a) o classin child classi olamaz ama final classin kendisi child olabilir.
                                        b)
     */

public abstract class Courses {

    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }



}//class
