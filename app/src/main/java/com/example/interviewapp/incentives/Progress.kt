package com.example.interviewapp.incentives

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interviewapp.R
import com.example.interviewapp.ui.theme.Orange

@Composable
fun ProgressBarIndicator(
    progress: Int,
    modifier: Modifier = Modifier,
    clipShape: androidx.compose.ui.graphics.Shape = RoundedCornerShape(10.dp)
) {
    val prog = progress.toFloat() / 100
    LinearProgressIndicator(
        progress = prog,
        backgroundColor = Orange.copy(alpha = 0.07f),
        color = Orange,
        modifier = modifier
            .fillMaxWidth()
            .height(30.dp)
            .clip(clipShape)
    )
}

@Composable
fun ProgressFlag(progress: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Card(
            elevation = 2.dp,
            modifier = modifier
        ) {
            Text(
                text = stringResource(id = R.string.progress_message, progress),
                modifier = Modifier.padding(8.dp)
            )
        }
        Box(
            modifier = Modifier
                .background(Orange)
                .height(30.dp)
                .width(2.dp)
        )
    }
}

@Composable
fun Progress(progress: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        ProgressFlag(progress = progress)
        ProgressBarIndicator(progress = progress)
    }
}




@Preview
@Composable
fun ProgressBarIndicatorPreview() {
    ProgressBarIndicator(progress = 65)
}

@Preview
@Composable
fun ProgressFlagPreview() {
    ProgressFlag(progress = 65)
}

@Preview
@Composable
fun ProgressPreview() {
    Progress(progress = 65)
}