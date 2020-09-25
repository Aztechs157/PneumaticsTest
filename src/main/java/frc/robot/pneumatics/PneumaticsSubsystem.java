/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.pneumatics;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.PneumaticsConstants.*;

public class PneumaticsSubsystem extends SubsystemBase {

    private final Compressor compressor = new Compressor(COMPRESSOR_ID);

    private final DoubleSolenoid cylinder = new DoubleSolenoid(COMPRESSOR_ID, CYLINDER_FORWARD_ID, CYLINDER_REVERSE_ID);

    public PneumaticsSubsystem() {
        compressor.start();
    }

    public void setCylinder(final DoubleSolenoid.Value value) {
        cylinder.set(value);
    }
}
