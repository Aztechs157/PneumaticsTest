/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.pneumatics;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.PneumaticsConstants.*;

public class PneumaticsSubsystem extends SubsystemBase {
    private final DigitalOutput output = new DigitalOutput(DIGITAL_OUTPUT_ID);

    private final Compressor compressor = new Compressor(COMPRESSOR_ID);

    private final DoubleSolenoid cylinder = new DoubleSolenoid(COMPRESSOR_ID, CYLINDER_FORWARD_ID, CYLINDER_REVERSE_ID);

    /**
     * Creates a new PnumaticsSubsystem.
     */
    public PneumaticsSubsystem() {

    }

    public void setOutput(final boolean signal) {
        output.set(signal);
    }

    public boolean getOutput() {
        return output.get();
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
