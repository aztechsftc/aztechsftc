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