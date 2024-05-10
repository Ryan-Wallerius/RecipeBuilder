USE [RecipeBuilder]
GO

/****** Object:  Table [dbo].[MealRecipe]    Script Date: 5/10/2024 11:54:33 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[MealRecipe](
	[MealPlannerID] [int] NOT NULL,
	[RecipesID] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MealPlannerID] ASC,
	[RecipesID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[MealRecipe]  WITH CHECK ADD FOREIGN KEY([MealPlannerID])
REFERENCES [dbo].[MealPlanner] ([MealPlannerID])
GO

ALTER TABLE [dbo].[MealRecipe]  WITH CHECK ADD FOREIGN KEY([RecipesID])
REFERENCES [dbo].[Recipes] ([RecipesID])
GO