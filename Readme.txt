Software Stack Installation:
  1. Download and install android studio
  https://developer.android.com/studio/index.html
  
  2. Download ftc app
  https://github.com/ftctechnh/ftc_app
  
  3. Download Git hub desktop
  https://github-windows.s3.amazonaws.com/GitHubSetup.exe

  4. Create a git hub account
  https://github.com/
    - Create username and password
    - Accept invitation email.

  5. Clone the Aztechs repository
  https://github.com/aztechsftc/aztechsftc.git

=====
Location of git.exe on windows.  We need to customize this in android studio
C:\Users\gunda\AppData\Local\GitHub\PortableGit_d7effa1a4a322478cd29c826b52a0c118ad3db11\cmd\git.exe

=====
wireless adb connection

	C:\Users\gunda\Work\Coustyx\Customers\Atieva\TimingFiles>adb devices
	adb devices
	List of devices attached
	28464A0246G86I2	device

	C:\Users\gunda\Work\Coustyx\Customers\Atieva\TimingFiles>adb tcpip 5555
	adb tcpip 5555

	C:\Users\gunda\Work\Coustyx\Customers\Atieva\TimingFiles>adb connect 192.168.0.10
	adb connect 192.168.0.10
	connected to 192.168.0.10:5555

	C:\Users\gunda\Work\Coustyx\Customers\Atieva\TimingFiles>adb devices
	adb devices
	List of devices attached
	192.168.0.10:5555	device

	C:\Users\gunda\Work\Coustyx\Customers\Atieva\TimingFiles>adb shell input text "hello
	adb shell input text "hello"

	C:\Users\gunda\Work\Coustyx\Customers\Atieva\TimingFiles>adb kill-server
	adb kill-server
 ===== 
Device names

01-12 20:00:02.938 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: ========= Device Information ===================================================
01-12 20:00:02.938 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: Type                                          Name                           Connection
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: Modern Robotics USB DC Motor Controller       Motor Elevator                 USB A104OPZK
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: Modern Robotics USB DC Motor Controller       Motor Wheels                   USB AL00UYEO
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: Modern Robotics USB DC Motor Controller       Motor Launcher                 USB A104OQFT
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: DC Motor                                      motorElevator                  USB A104OPZK; port 1
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: DC Motor                                      motorLeft                      USB AL00UYEO; port 2
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: DC Motor                                      motorBrush                     USB A104OPZK; port 2
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: DC Motor                                      motorLauncherL                 USB A104OQFT; port 2
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: DC Motor                                      motorRight                     USB AL00UYEO; port 1
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: DC Motor                                      motorLauncherR                 USB A104OQFT; port 1
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: Modern Robotics USB DC Motor Controller       Motor Elevator                 USB A104OPZK
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: Modern Robotics USB DC Motor Controller       Motor Wheels                   USB AL00UYEO
01-12 20:00:02.948 15502-15539/com.qualcomm.ftcrobotcontroller I/RobotCore: Modern Robotics USB DC Motor Controller       Motor Launcher                 USB A104OQFT
 ===== 


sample code for using encoders

http://ftc.flfirst.org/index.php/helpful-links/tips/98-ftc-409-motor-encoder-example

http://ftcforum.usfirst.org/showthread.php?4333-Encoders

https://www.youtube.com/watch?v=d0liBxZCtrA

http://ftcforum.usfirst.org/showthread.php?7100-Encoders-and-Autonomous


 =====

https://www.firstchesapeake.org/images/downloads/2016/ftc/VCU_Autonomous-Programming-Session.pdf 
