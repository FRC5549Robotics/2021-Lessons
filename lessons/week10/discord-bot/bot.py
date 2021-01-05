import discord
import config
import logging
from discord.ext import commands

# client = discord.Client()
intents = discord.Intents(guilds=True, members=True, messages=True)
bot = commands.Bot(command_prefix='$', intents=intents)
logging.basicConfig(level=logging.INFO)

@bot.event
async def on_ready():
    print(f"We are logged in as {bot.user}")

@bot.command()
async def hello(ctx):
    await ctx.send("Hello")

@bot.command()
async def echo(ctx, args):
    await ctx.send(args)

@bot.command()
async def kick(ctx, args):
    server = ctx.guild
    user = bot.get_user(int(args))
    await server.kick(user)

bot.run(config.BOT_TOKEN)
