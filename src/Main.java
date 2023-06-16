public class Main {
    public static void main(String[] args) {

        class Hero {
            private int health;
            private int damage;

            public Hero(int health, int damage, String superpower) {
                this.health = health;
                this.damage = damage;
            }

            public Hero(int health, int damage) {
                this.health = health;
                this.damage = damage;
            }

            public int getHealth() {
                return health;
            }

            public int getDamage() {
                return damage;
            }
        }
        class Boss {
            private int health;
            private int damage;
            private String defenseType;

            public int getHealth() {
                return health;
            }

            public void setHealth(int health) {
                this.health = health;
            }

            public int getDamage() {
                return damage;
            }

            public void setDamage(int damage) {
                this.damage = damage;
            }

            public String getDefenseType() {
                return defenseType;
            }

            public void setDefenseType(String defenseType) {
                this.defenseType = defenseType;
            }
        }
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Тип защиты босса: " + boss.getDefenseType());
    }
}