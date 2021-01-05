# Week <int> Meeting
This meeting occured during the date of <date>.

# Summary
Today, we decided to have fun and code a Discord bot!

# Topics

## Installation
Install discord.py 

Windows:
```bash
py -3 -m pip install -U discord.py
```

Linux:
```bash
python3 -m pip install -U discord.py
```

Another way to install `discord.py` is by running `pip3 install -U discord.py`. However, this is not guaranteed to work on all systems.

## Running Bot
```python
import discord

client = discord.Client()

@client.event
async def on_ready():
    print('We have logged in as {0.user}'.format(client))

client.run('your token here')
```

## Adding Logging
As the `logging` module is included with Python, it does not need to be installed.

```python
import logging

logging.basicConfig(level=logging.INFO)
...
```

## Creating a Bot Account
Follow the directions [here](https://discordpy.readthedocs.io/en/latest/discord.html).

## Setting up Config
*config.py*
```python
BOT_TOKEN=...
```

*bot.py*
```python
import discord
import config
...
client.run(config.BOT_TOKEN)
```

## Adding Commands
```python
...
from discord.ext import commands

bot = commands.Bot(command_prefix='$')
...

@bot.command()
async def hello(ctx):
    ctx.send(hello)
```

## Command Arguments
```
@bot.command()
async def reply(ctx, args):
    ctx.send(args)
```

## Kick
```python
@bot.command()
async def kick(ctx, args):
    server = ctx.guild
    user = get_user(args[0])
    server.kick(user)
```

## Member Join Message
```
async def on_member_join(self, member):
    guild = member.guild
    if guild.system_channel is not None:
        to_send = f'Welcome {member} to {guild}!'
        await guild.system_channel.send(to_send)
```

# Additional Resources
- [Discord.py Documentation](https://discordpy.readthedocs.io/en/latest/)
