'''
Created on 2023. 8. 17.

@author: LG
'''
from day12.classAudio import Audio
from day12.classTV import TV
obj01 = Audio(True, 15)
obj02 = TV(False,12,40)

obj01.set_volumn(10)
obj01.tune()

obj02.Switch(True)
obj02.watch()