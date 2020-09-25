/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.pneumatics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TogglePneumaticsCommand extends CommandBase {
    private final PneumaticsSubsystem pneumatics;

    /**
     * Creates a new TogglePneumaticsCommand.
     */
    public TogglePneumaticsCommand(final PneumaticsSubsystem pneumatics) {
        this.pneumatics = pneumatics;
        addRequirements(pneumatics);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        var currentSignal = pneumatics.getOutput();
        pneumatics.setOutput(!currentSignal);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return true;
    }
}