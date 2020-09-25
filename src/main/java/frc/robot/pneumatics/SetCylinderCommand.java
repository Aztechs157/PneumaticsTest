/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.pneumatics;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class SetCylinderCommand extends CommandBase {
    private final PneumaticsSubsystem pneumatics;
    private final Value value;

    /**
     * Creates a new SetCylinderCommand.
     */
    public SetCylinderCommand(final PneumaticsSubsystem pneumatics, final DoubleSolenoid.Value value) {
        this.pneumatics = pneumatics;
        this.value = value;
        addRequirements(pneumatics);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        pneumatics.setCylinder(value);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return true;
    }
}
