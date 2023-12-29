'''
Created on 2023. 8. 17.

@author: LG
'''
class AudioTVParent:
    def __init__(self, power,volumn):
        self.power = power
        self.volumn = volumn
        
    def Switch(self, onOff):
        self.power = onOff
        
    def set_volumn(self, vol):
        self.volumn = vol