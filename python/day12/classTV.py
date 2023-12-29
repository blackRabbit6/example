'''
Created on 2023. 8. 17.

@author: LG
'''
from day12.AudioTVParent import AudioTVParent

class TV(AudioTVParent):
    def __init__(self,power,volumn,size):
        super().__init__(power, volumn)
        self.size = size
        
    def watch(self):
        str02 ="Have fun"if self.power else "Switch on"
        print(str02)