package problem1.builder;

import problem1.Product;
import problem1.components.appstore.ApplicationFactory;
import problem1.components.commsystem.CommSystemFactory;
import problem1.components.controlunit.ControlUnitFactory;
import problem1.components.displaysystem.DisplaySystemFactory;

public abstract class SystemBuilder {
    protected Product product;
    protected ApplicationFactory applicationFactory;
    protected CommSystemFactory commSystemFactory;
    protected ControlUnitFactory controlUnitFactory;
    protected DisplaySystemFactory displaySystemFactory;

    public SystemBuilder() {
        this.product = new Product();
        this.applicationFactory = new ApplicationFactory();
        this.commSystemFactory = new CommSystemFactory();
        this.displaySystemFactory = new DisplaySystemFactory();
        this.controlUnitFactory = new ControlUnitFactory();
    }

    public void addApplication() {
        product.addComponents(applicationFactory.getApplication("Controller App"));
    }
    public void addCommSystem(String commSystemType) {
        product.addComponents(commSystemFactory.getCommSystem(commSystemType));
    }
    public abstract void addDisplayUnits(int displayUnitCount);

    public Product getProduct() {
        return product;
    }

}
