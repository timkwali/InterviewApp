package com.example.interviewapp.incentives

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.interviewapp.R

@Composable
fun Incentives(modifier: Modifier, progress: Int) {
    Surface(modifier = modifier) {
        Column(modifier = Modifier.padding(16.dp)) {
            AppBar(text = stringResource(id = R.string.incentives))
            WarningBar(
                text = stringResource(id = R.string.waning_string,),
                modifier = Modifier.padding(top = 24.dp)
            )
            Progress(progress, modifier = Modifier.padding(top = 24.dp))
        }
    }
}

@Preview
@Composable
fun IncentivesPreview() {
    Incentives(modifier = Modifier, progress = 65)
}