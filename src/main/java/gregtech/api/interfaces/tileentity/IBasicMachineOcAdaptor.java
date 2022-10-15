package gregtech.api.interfaces.tileentity;

/**
 * offer api for open computers
 * @author prymon
 */
public interface IBasicMachineOcAdaptor {

    /* pop up all the items in input slots to output side*/
    void popUpAllInputSlot();

    /* pop up all the items in specific slots to output side*/
    /* support input&output slot */
    void popUpSlot(int slot, byte outputSide);
}
