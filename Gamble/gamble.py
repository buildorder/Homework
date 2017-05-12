import joystick
import led
import character_lcd

import RPi.GPIO as GPIO
import time

def clear(joy, lcd, Led_one, Led_two):
    joy.counter = 0
    joy.start_flag = 0

    lcd.clear()
    lcd.puts("PRESS TO START")

    Led_one.off()
    Led_two.off()

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)

joy = joystick.Joystick()
joy.start()

lcd = character_lcd.CharLcd()

Led_one = led.Led(1)
Led_two = led.Led(2)

while (1) :

    clear(joy, lcd, Led_one, Led_two)

    while(joy.start_flag == 0):
        pass

    lcd.clear()
    lcd.puts("STARTED")
    time.sleep(5)

    if (joy.counter % 2 == 0) :
        Led_one.on()
        Led_two.on()

    elif (joy.counter % 2 == 1) :
        Led_one.off()
        Led_two.on()

    print(joy.counter)
    time.sleep(2)
