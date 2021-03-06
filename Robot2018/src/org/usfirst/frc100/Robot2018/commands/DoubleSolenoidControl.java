

package org.usfirst.frc100.Robot2018.commands;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc100.Robot2018.OI;
import org.usfirst.frc100.Robot2018.Robot;
import org.usfirst.frc100.Robot2018.RobotMap;

/**
 *
 */
public class DoubleSolenoidControl extends Command {
	public static boolean done;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DoubleSolenoidControl() {
    	
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

        //requires(Robot.DoubleSolen);


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    	requires(Robot.wrist);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	done = false;
    	////System.out.println("ENTERED DOUBLE SOLENOID=======================================");
    	
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {

    	//if(Robot.MaunalDuo){
    		if(OI.operator.getRawButtonPressed(7)){
    			if(RobotMap.DuoSol.get() == Value.kForward){
    				RobotMap.DuoSol.set(DoubleSolenoid.Value.kOff);
    			}else{
    				RobotMap.DuoSol.set(DoubleSolenoid.Value.kForward);
    			}
    		}else if(OI.operator.getRawButtonPressed(5)){
    			if(RobotMap.DuoSol.get() == Value.kReverse){
    				RobotMap.DuoSol.set(Value.kOff);
    			}else{
    				RobotMap.DuoSol.set(Value.kReverse);
    			}
    		}
    	/*}else{



    		if(OI.operator.getRawButtonPressed(9)){
    			RobotMap.DuoSol.set(DoubleSolenoid.Value.kForward);
    			new passTime(4);
    			RobotMap.DuoSol.set(DoubleSolenoid.Value.kOff);
    		}else if(OI.operator.getRawButtonPressed(10)){
    			if(RobotMap.DuoSol.get() == Value.kReverse){
    				RobotMap.DuoSol.set(Value.kOff);
    			}else{
    				RobotMap.DuoSol.set(Value.kReverse);
    			}	

    		//}

    	}*/


    	}

    

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}

