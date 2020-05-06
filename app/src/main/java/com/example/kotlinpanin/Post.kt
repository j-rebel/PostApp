package com.example.kotlinpanin

import org.joda.time.LocalDateTime

data class Post(val posterName: String,
                val posterAvatar: Int,
                val date: LocalDateTime,
                val text: String,
                var likes: Int,
                var comments: Int,
                var shares: Int,
                var isLiked: Boolean = false,
                var isCommented: Boolean = false,
                var isShared: Boolean = false)
