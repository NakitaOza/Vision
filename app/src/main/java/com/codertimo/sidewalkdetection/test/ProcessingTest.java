package com.codertimo.sidewalkdetection.test;

import com.codertimo.sidewalkdetection.algorithm.SWDGlobalValue;
import com.codertimo.sidewalkdetection.algorithm.SWDProcessor;
import com.codertimo.sidewalkdetection.algorithm.type.ComparableLine;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;

/**
 * Created by codertimo on 2016. 2. 1..
 */
public class ProcessingTest
{

    private SWDProcessor processer = new SWDProcessor();

    public ProcessingTest(){
        //run test

    }

    private void SWDProcess(Mat input)
    {
        //1. HoughLine 결과물을 적용함
        Mat houghLineResult = processer.getHoughLineResult(input);

        //2. 2개의 중요 직선을 검출하는 작업
        ComparableLine[] twoLine = processer.getTwoLine(houghLineResult);

        //3. 기울기 메트에 그리기
        Core.line(SWDGlobalValue.slopeStack, new Point(twoLine[0].point.x1, twoLine[0].point.y1), new Point(twoLine[0].point.x2, twoLine[0].point.y2), new Scalar(111), 3);
        Core.line(SWDGlobalValue.slopeStack, new Point(twoLine[1].point.x1, twoLine[1].point.y1), new Point(twoLine[1].point.x2, twoLine[1].point.y2), new Scalar(111), 3);

        //4. 현재 보행자가 어떤 상황인지 파악
        processer.compareCurrent();

    }


}
