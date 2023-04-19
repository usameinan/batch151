package day28interface;

public interface Animal {

    void eat();
    void drink();

    /*
    1)interfacelerdeki tum variablelar otomatik(default) olarak "final"dir.
      bu yuzden interface icindeki variablei olusturdugunuzda mutlaka deger atamasi yapmalisiniz.
      bilindigi gibi final variablelarin degerleri degistirilemez.

    2) interfacelerdeki tum variablelar otomatik(default) olarak "public"dir.

    3) İnterfacelerdeki tum variablelar otomatik(default) olarak "static"dir.
     */
    int age = 4;


}//int
