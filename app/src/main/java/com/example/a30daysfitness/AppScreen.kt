package com.example.a30daysfitness

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysfitness.model.ActivitiesRepository.activities
import com.example.a30daysfitness.model.Activity

@Composable
fun ActivityCard(activity: Activity, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        onClick = {expanded = !expanded},
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = modifier
    ) {
        Column(
            modifier = modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessHigh
                    )
                )
        ) {
            Text(
                text = stringResource(activity.day),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = stringResource(activity.exercise),
                style = MaterialTheme.typography.bodyLarge
            )
            Image(
                painter = painterResource(activity.image),
                contentDescription = stringResource(activity.exercise),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            if (expanded) {
                Text(
                    text = stringResource(activity.description),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun ActivityList(activities: List<Activity>, modifier: Modifier = Modifier) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .padding(vertical = 16.dp, horizontal = 16.dp)
    ) {
        items(activities) { activity ->
            ActivityCard(
                activity = activity,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun ActivityCardPreview() {
    ActivityList(activities)
}