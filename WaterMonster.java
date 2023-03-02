class WaterMonster extends Monster {

    // TODO : add constructor and initialize type to "water"

    public WaterMonster(String name, int attack){
        super(name, attack, "Water");
    }
    
    // TODO : create an attack method which deals x2 damage to "fire"

    @Override
    public boolean attack(Monster opponent){
        int opponentCurrentLife = opponent.getLife();
        String opponentType = opponent.getType();

        if(opponentType.equals("Fire")){
            opponent.setLife(opponentCurrentLife - this.getAttack()*2);
        } else {
            opponent.setLife(opponentCurrentLife - this.getAttack());
        }
        
        return opponent.isKO();
    }
    
}