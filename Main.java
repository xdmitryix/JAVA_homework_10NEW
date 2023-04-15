public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Лучник 1", 100, new WoodShield(), new Bow(20)))
                .addPers(new Archer("Лучник 2", 100, new GlassShield(), new Bow(15)));
        thiefTeam.addPers(new Thief("Вор 1", 150, new MakeshiftShield(), new Knife()))
                .addPers(new Thief("Вор 2", 150, new GlassShield(), new Knife()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        System.out.println();

        Archer robin = new Archer("Лучник 1", 50, new WoodShield(), new Bow(20));
        Archer gud = new Archer("Лучник 2", 50, new WoodShield(), new Bow(50));
        Battle fight = new Battle(robin,gud);
        fight.run();
    }
}
