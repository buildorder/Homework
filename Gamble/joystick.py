import RPi.GPIO as GPIO

class Joystick():
    UP, DOWN, LEFT, RIGHT, CENTER = 0, 1, 2, 3, 4
    counter = 0
    start_flag = 0

    def __init__(self, ):
        self.up = 5
        self.down = 6
        self.left = 16
        self.right = 20
        self.center = 21
    
        GPIO.setup(self.up, GPIO.IN)
        GPIO.setup(self.down, GPIO.IN)
        GPIO.setup(self.left, GPIO.IN)
        GPIO.setup(self.right, GPIO.IN)
        GPIO.setup(self.center, GPIO.IN)

    def check(self, gpio):
        if gpio == self.center:
            self.start_flag = 1

        else :
            self.counter += 1

    def start(self):
        GPIO.add_event_detect(self.up, GPIO.RISING, callback=self.check, bouncetime=50)
        GPIO.add_event_detect(self.down, GPIO.RISING, callback=self.check, bouncetime=50)
        GPIO.add_event_detect(self.left, GPIO.RISING, callback=self.check, bouncetime=50)
        GPIO.add_event_detect(self.right, GPIO.RISING, callback=self.check, bouncetime=50)
        GPIO.add_event_detect(self.center, GPIO.RISING, callback=self.check, bouncetime=50)

    def stop(self):
        GPIO.remove_event_detect(self.up)
        GPIO.remove_event_detect(self.down)
        GPIO.remove_event_detect(self.left)
        GPIO.remove_event_detect(self.right)
        GPIO.remove_event_detect(self.center)
