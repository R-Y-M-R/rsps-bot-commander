package lavaRunner;

/**
 * This class will contain all configuration for the lava runner script.
 * Ideally these would be prompted & saved somewhere.
 */
public class Config {
	
	/**
	 * The amount of essence each mule should withdraw. Expected to be <= 28, probably 25
	 */
	public static final int ESSENCE_TO_WITHDRAW = 25; 
	
	/**
	 * The minimum amount of essence required in inventory for a trade to occur.
	 */
	public static final int NEED_BANK_THRESHOLD = 10;
	
	/**
	 * The amount of time in between camera resets.
	 */
	public static final long CAMERA_RESET = 180000;
	
	/**
	 * The amount of time in between trades with the master.
	 */
	public static final long TRADE_COOLDOWN = 2500; //5 seconds = 5000 miliseconds
	
	/**
	 * Will print additional debug messages.
	 */
	public static final boolean EXTREME_DEBUGGING = true;
	
	/**
	 * Will mule and offer Binding necklaces to master when they are out.
	 */
	public static final boolean MULE_BINDINGS = true;
	
	/**
	 * Will use Rings of Dueling to bank and teleport back to altar.
	 */
	public static final boolean RING_OF_DUELING = true;

}
