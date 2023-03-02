class AirMonster extends Monster{

    // TODO : add constructor and initialize type to "air"

    public AirMonster(String name, int attack){
        super(name, attack, "Air");
    }
    
    // TODO : create an attack method which deals x2 damage to "water"

    @Override
    public boolean attack(Monster opponent){
        int opponentCurrentLife = opponent.getLife();
        String opponentType = opponent.getType();

        if(opponentType.equals("Water")){
            opponent.setLife(opponentCurrentLife - this.getAttack()*2);
        } else {
            opponent.setLife(opponentCurrentLife - this.getAttack());
        }
        
        return opponent.isKO();
    }
    
}