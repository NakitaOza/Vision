//
// Created by 김준성 on 2016. 5. 14..
//
#include "EscapeDetection.h"

static LineMap lineMap;

void escapeDetection_initailize()
{
    lineMap = LineMap::LineMap();
    LineMap::setSmStack(Size(600, 400));
}
void escapeDetection_lineAccumulate(ResultLines resultLines){
    lineMap.accumulate_lines(resultLines);
}
int escapeDetection()
{
    lineMap.escapeDetection();
}
