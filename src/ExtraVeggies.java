public class ExtraVeggies extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraVeggies(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 20;
    }
}
