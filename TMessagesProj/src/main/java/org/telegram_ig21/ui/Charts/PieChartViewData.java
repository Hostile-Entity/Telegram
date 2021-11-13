package org.telegram_ig21.ui.Charts;

import android.animation.Animator;

import org.telegram_ig21.ui.Charts.data.ChartData;
import org.telegram_ig21.ui.Charts.view_data.StackLinearViewData;

public class PieChartViewData extends StackLinearViewData {

    float selectionA;
    float drawingPart;
    Animator animator;

    public PieChartViewData(ChartData.Line line) {
        super(line);
    }
}
