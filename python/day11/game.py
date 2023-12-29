import sys
import pygame
from pygame.locals import QUIT

pygame.init()
SURFACE = pygame.display.set_mode((400,300))
pygame.display.set_selection("Just Window")

#메인 함수 구현
def main():
    sysfont = pygame.font._SysFont(None, 36)
    counter = 0
    while True:
        SURFACE.fill((0,0,0))
        
        for event in pygame.event.get():
            if event.type == QUIT:
                pygame.quit()
                sys.exit()
                
        counter += 1
                
        pygame.display.update()

# 메인
if __name__ == '__main__':
    main()