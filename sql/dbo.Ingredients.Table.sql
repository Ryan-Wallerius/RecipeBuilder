USE [RecipeBuilder]
GO

/****** Object:  Table [dbo].[Ingredients]    Script Date: 5/13/2024 12:49:58 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Ingredients](
	[IngredientID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](255) NOT NULL,
	[Quantity] [nvarchar](255) NOT NULL,
	[Unit] [nvarchar](255) NOT NULL,
	[RecipeID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IngredientID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Ingredients]  WITH CHECK ADD  CONSTRAINT [FK__Ingredien__Recip__6FE99F9F] FOREIGN KEY([RecipeID])
REFERENCES [dbo].[Recipes] ([RecipesID])
GO

ALTER TABLE [dbo].[Ingredients] CHECK CONSTRAINT [FK__Ingredien__Recip__6FE99F9F]
GO


