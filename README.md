# SideWalk Detection Algorithm

#### Sidewalk Detection Algorithm based on Line Detection

Existing Sidewalk Detection Algorithms are based on Color Histogram. They find frames which color is gray and reconized those parts are the sidewalk. However if the sidewalk's color is not gray or has a lot of pattern, algorithm coudn't works.

So we found the other way to detect sidewalks. It's **Line Detection** and **Vanishing Point**. Using those features, we could detect the sidewalk more efficiently.

Using this Algorithm, we can detect **Area of Sidewalk**, **Coner Of Sidewalk** and **Possibility of breakaway from sidewalk**

In Addition, we develop improved SideWalk Detection that works on **Multiple Color Sidewalk**

## Result Images

![sidewalk_de](https://github.com/codertimo/SideWalkDetection/blob/master/images/sidewalk_color.png)

![vanish](https://github.com/codertimo/SideWalkDetection/blob/master/images/vanishing.png)

![vertical](https://github.com/codertimo/SideWalkDetection/blob/master/images/vertical_corner.png)

![vertical](https://github.com/codertimo/SideWalkDetection/blob/master/images/unknown_corner.png)



## Contributor

### Helped by,

Chris Ohk : utilForever@gmail.com

### Made By,

Junseong Kim : codertimo@gmail.com

Dongmin Kim : dmk98@naver.com

##### Korea Digital Media High School 13th Hacking Defence

## License

OpenCV License : [OpenCv Website License URL](http://opencv.org/license.html)
