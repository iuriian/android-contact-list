package com.iuriian.androidcontactlist.view.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

data class ToolbarNavigation(
    val navigate: () -> Unit = {},
    val icon: ImageVector? = null,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen(
    toolbarNavigation: ToolbarNavigation? = null,
    content: @Composable () -> Unit,
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Contact")
                },
                navigationIcon = {
                    toolbarNavigation?.icon?.let {
                        IconButton(onClick = toolbarNavigation.navigate) {
                            Icon(
                                imageVector = it,
                                contentDescription = null,
                            )
                        }
                    }
                },
                colors =
                    TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    ),
            )
        },
    ) { innerPadding ->
        val scrollState = rememberScrollState()

        Surface(
            modifier = Modifier.padding(innerPadding).fillMaxSize().verticalScroll(scrollState),
        ) {
            content()
        }
    }
}
