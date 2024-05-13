USE [RecipeBuilder]
GO

/****** Object:  Table [dbo].[Recipes]    Script Date: 5/13/2024 12:50:31 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Recipes](
	[RecipesID] [int] IDENTITY(1,1) NOT NULL,
	[RecipeName] [nvarchar](100) NOT NULL,
	[DayOfWeek] [nvarchar](25) NOT NULL,
	[CreatedBy] [nvarchar](100) NOT NULL,
	[CreatedDate] [datetime2](7) NOT NULL,
	[IngredientID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[RecipesID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Recipes]  WITH CHECK ADD FOREIGN KEY([IngredientID])
REFERENCES [dbo].[Ingredients] ([IngredientID])
GO



