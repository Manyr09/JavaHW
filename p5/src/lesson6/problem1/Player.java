package lesson6.problem1;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new Pistol(),
                new Autopistol(),
                new RPG(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль
        if (slot < 0 || slot > weaponSlots.length){
            System.out.println("У вас нету оружия на этои слоте!");
            return;
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
