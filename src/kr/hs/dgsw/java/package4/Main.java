package kr.hs.dgsw.java.package4;

public class Main {
    public static void main(String[] args) {
        VariableStudy variableStudy = new VariableStudy();

        variableStudy.study();

        SomeClass someClass = new SomeClass();

        someClass.someMethod2(1);

        Anime anime = new Anime();
        anime.setName("이름");
        anime.setAge(9);
        anime.setHeight(130);
        anime.setWeight(60);
        System.out.println(anime.getName() + anime.getAge() + anime.getHeight() + anime.getWeight());
    }
}
