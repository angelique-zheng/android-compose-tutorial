package com.angelique.android_compose_tutorial

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.angelique.android_compose_tutorial.ui.theme.AndroidComposeTutorialTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConversation() {
    AndroidComposeTutorialTheme {
        Conversation(SampleData)
    }
}

val SampleData: List<Message> = listOf(
    Message("Toto", "Hello world !"),
    Message(
        "Tata",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vitae viverra mauris, sit amet vulputate ante. Ut in nisi in mi sollicitudin ultrices a id neque. Morbi volutpat pretium interdum. "
    ),
    Message("Android", "Hello world !"),
    Message(
        "iOS",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vitae viverra mauris, sit amet vulputate ante. Ut in nisi in mi sollicitudin ultrices a id neque. Morbi volutpat pretium interdum. "
    )
)