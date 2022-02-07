import java.util.ArrayList;

/**
 * This class represents a UsedCarLot object
 *
 * @author Daniyal Rana
 */
public class UsedCarLot
{
    /**Represents a list of all cars in UsedCarLot*/
    private ArrayList<Car> inventory;

    /**Initializes UsedCarLot class*/
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**Returns a list of all cars in the UsedCarLot object
     *
     * @return The inventory
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds a car to the inventory
     *
     * @param car A Car object
     */
    public void addCar(Car car)
    {
        inventory.add(car);
    }

    /**
     * Swaps the position of two cars in the inventory list
     *
     * @param idx1 Index of the first car to be swapped
     * @param idx2 Index of the second car to be swapped
     * @return True if the cars were swapped successfully, false otherwise
     */
    public boolean swap(int idx1, int idx2)
    {
        if (inventory.size() > idx1 && inventory.size() > idx2 && idx1 >= 0 && idx2 >= 0)
        {
            Car replaced = inventory.get(idx1);
            inventory.set(idx1, inventory.get(idx2));
            inventory.set(idx2, replaced);
            return true;
        }
        return false;
    }

    /** Adds a Car to the inventory list at the index specified and increases inventory size by 1
     *<p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index where the car will be added
     * @param carToAdd A Car object that will be added at the specified index
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Removes the car at the specified index from the inventory list
     * and shifts the remaining cars in the inventory list to the left
     * Reduces inventory size by one
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car that will be removed
     * @return The Car that was removed
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Replaces the car at the specified index from the inventory list with a null value
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car that will be set to null
     * @return The Car that was set to null
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell, null);
    }

    /**
     * Moves the car at the indexOfCarToMove to the destinationIndex
     * All other cars shift accordingly
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     * <p>
     * destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove The index of the Car to be moved
     * @param destinationIndex the index that the Car will be moved to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car moved = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, moved);
    }

}
